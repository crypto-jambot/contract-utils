package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class UniswapV3PoolSwapTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50610522806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80637f2ba7bc1461003b578063fa461e331461009e575b600080fd5b6100776004803603608081101561005157600080fd5b506001600160a01b0381358116916020810135151591604082013591606001351661011c565b6040805193845260208401929092526001600160a01b031682820152519081900360600190f35b61011a600480360360608110156100b457600080fd5b8135916020810135918101906060810160408201356401000000008111156100db57600080fd5b8201836020820111156100ed57600080fd5b8035906020019184600183028401116401000000008311171561010f57600080fd5b5090925090506102d9565b005b6000806000866001600160a01b031663128acb0860008888883360405160200180826001600160a01b031681526020019150506040516020818303038152906040526040518663ffffffff1660e01b815260040180866001600160a01b031681526020018515158152602001848152602001836001600160a01b0316815260200180602001828103825283818151815260200191508051906020019080838360005b838110156101d65781810151838201526020016101be565b50505050905090810190601f1680156102035780820380516001836020036101000a031916815260200191505b5096505050505050506040805180830381600087803b15801561022557600080fd5b505af1158015610239573d6000803e3d6000fd5b505050506040513d604081101561024f57600080fd5b50805160209091015160408051633850c7bd60e01b815290519295509093506001600160a01b03891691633850c7bd9160048082019260e092909190829003018186803b15801561029f57600080fd5b505afa1580156102b3573d6000803e3d6000fd5b505050506040513d60e08110156102c957600080fd5b5051929791965091945092505050565b6000828260208110156102eb57600080fd5b50356001600160a01b0316905060008513156103f157336001600160a01b0316630dfe16816040518163ffffffff1660e01b815260040160206040518083038186803b15801561033a57600080fd5b505afa15801561034e573d6000803e3d6000fd5b505050506040513d602081101561036457600080fd5b5051604080516323b872dd60e01b81526001600160a01b03848116600483015233602483015260448201899052915191909216916323b872dd9160648083019260209291908290030181600087803b1580156103bf57600080fd5b505af11580156103d3573d6000803e3d6000fd5b505050506040513d60208110156103e957600080fd5b506104e59050565b60008413156104e557336001600160a01b031663d21220a76040518163ffffffff1660e01b815260040160206040518083038186803b15801561043357600080fd5b505afa158015610447573d6000803e3d6000fd5b505050506040513d602081101561045d57600080fd5b5051604080516323b872dd60e01b81526001600160a01b03848116600483015233602483015260448201889052915191909216916323b872dd9160648083019260209291908290030181600087803b1580156104b857600080fd5b505af11580156104cc573d6000803e3d6000fd5b505050506040513d60208110156104e257600080fd5b50505b505050505056fea264697066735822122041c3fc587c53f203f8874e3c353713071a54dbf28721aec3a53e23b1bd3ff92664736f6c63430007060033";

    public static final String FUNC_GETSWAPRESULT = "getSwapResult";

    public static final String FUNC_UNISWAPV3SWAPCALLBACK = "uniswapV3SwapCallback";

    @Deprecated
    protected UniswapV3PoolSwapTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected UniswapV3PoolSwapTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected UniswapV3PoolSwapTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected UniswapV3PoolSwapTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> getSwapResult(String pool, Boolean zeroForOne, BigInteger amountSpecified, BigInteger sqrtPriceLimitX96) {
        final Function function = new Function(
                FUNC_GETSWAPRESULT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, pool), 
                new org.web3j.abi.datatypes.Bool(zeroForOne), 
                new org.web3j.abi.datatypes.generated.Int256(amountSpecified), 
                new org.web3j.abi.datatypes.generated.Uint160(sqrtPriceLimitX96)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> uniswapV3SwapCallback(BigInteger amount0Delta, BigInteger amount1Delta, byte[] data) {
        final Function function = new Function(
                FUNC_UNISWAPV3SWAPCALLBACK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Int256(amount0Delta), 
                new org.web3j.abi.datatypes.generated.Int256(amount1Delta), 
                new org.web3j.abi.datatypes.DynamicBytes(data)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static UniswapV3PoolSwapTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new UniswapV3PoolSwapTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static UniswapV3PoolSwapTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new UniswapV3PoolSwapTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static UniswapV3PoolSwapTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new UniswapV3PoolSwapTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static UniswapV3PoolSwapTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new UniswapV3PoolSwapTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<UniswapV3PoolSwapTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(UniswapV3PoolSwapTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<UniswapV3PoolSwapTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UniswapV3PoolSwapTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<UniswapV3PoolSwapTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(UniswapV3PoolSwapTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<UniswapV3PoolSwapTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(UniswapV3PoolSwapTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
